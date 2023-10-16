# MergeSort in Python


def mergeSort(array):
    if len(array) > 1:

        #  r is the point where the array is divided into two subarrays
        r = len(array)//2
        l= array[:r]
        m = array[r:]

        # Sort the two halves
        mergeSort(l)
        mergeSort(m)

        i = j = k = 0

        # Until we reach either end of either L or M, pick larger among
        # elements L and M and place them in the correct position at A[p..r]
        while i < len(l) and j < len(m):
            if l[i] < m[j]:
                array[k] = l[i]
                i += 1
            else:
                array[k] = m[j]
                j += 1
            k += 1

        # When we run out of elements in either L or M,
        # pick up the remaining elements and put in A[p..r]
        while i < len(l):
            array[k] = l[i]
            i += 1
            k += 1

        while j < len(m):
            array[k] = m[j]
            j += 1
            k += 1


# Print the array
def printList(array):
    for i in range(len(array)):
        print(array[i], end=" ")
    print()


# Driver program
if __name__ == '__main__':
    array = [6, 5, 12, 10, 9, 1]

    mergeSort(array)

    print("Sorted array is: ")
    printList(array)
