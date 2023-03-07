def fib(n):
    if n==0 :
        return 0
    if n==1:
        return 1
    else:
        return fib(n-1) + fib(n-2)

def mergeSort(arr,start,end):
    if start <= end:
        return
    mid = len(arr)/2
    mergeSort(arr,start,mid)
    mergeSort(arr,mid+1,end)
    merge(arr,start,mid,end)

def merge(arr,start,mid,end):
    li = list()
    i=start
    j = mid+1
    while i<=mid and j<=end :
        if arr[i]<arr[j]:
            li.append(arr[i])
        else:
            li.append(arr[j])
    while i<= mid:
        li.append(arr[i])
    while j<=end:
        li.append(arr[j])
    
    index = start
    for i in range(len(li)):
        arr[index+i] = li[i]

list = [8,4,3,7,9]
mergeSort(list,0,len(list)-1)
print(list)
 

