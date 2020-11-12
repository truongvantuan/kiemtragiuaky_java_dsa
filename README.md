## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management 

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).

## Lý Thuyết

1A: Nêu các khía cạnh có thể  sử dụng để so sánh giữa các thuật toán sort: Selection sort, Insertion sort và Bubble sort 

| Kiểu sort    |    Đặc điểm    | Điểm mạnh |    Điểm yếu   |
| :---         |     :---:      |   :---:   |      :---    |
| Selection Sort   | T[Best Case]= O(n²), T[Worst Case]= θ(n²)   | In-Place sort | sắp xếp chậm, cho mọi case |
| Bubble Sort    | T[Best Case] = O(n), T[Worst Case]= θ(n²) | sắp xếp nhanh với input đã sắp xếp | sắp xếp chậm |
| Insertion Sort    | T[Best Case] = O(n), T[Worst Case]= θ(n²) | Tính ổn định, In-Place sort. | Chỉ hiệu quả khi N nhỏ |

1B: Collection.sort trong Java (bản hiện tại 2020/11/12) sử dụng thuật toán Tim sort. Hãy cho biết Tim sort là gì? Trình bày hiểu biết về Tim sort
 
 - Thụât toán sắp xếp dựa trên Insertion Sort và Merge Sort
 - sắp xếp ổn định với T[N] = O(nlog(n))
 - 