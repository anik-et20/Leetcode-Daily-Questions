class Solution:
    def canPlaceFlowers(self, nums: List[int], f: int) -> bool:
        i = 1 
        length = len(nums)
        if length == 1:
            return nums[0] == 0 or f == 0

        if nums[0] == 0 and nums[1] == 0:
            nums[0] = 1
            f -= 1
        while(i < length-1):
            if(f==0):
                return True
            if(nums[i-1] == 0 and nums[i] == 0 and nums[i+1] == 0):
                nums[i] = 1
                f-=1
                i+=2
            elif(nums[i-1]== 1 and nums[i]==0):
                i+=1
            elif(nums[i-1] == 1 and nums[i+1]== 1):
                i+=3
            else:
                i+=1
        if(nums[length-1] == 0 and nums[length-2] == 0):
            nums[length-1] = 1
            f -= 1

        return f <= 0