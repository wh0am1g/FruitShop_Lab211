# FruitShop_Lab211
Application Layer:với tiến trình ứng dụng,
cấp giao diện, người dùng và phần mềm
HTTP,
Presentation Layer:phiên dịch,mã hóa,giải mã,nén dữ liệu.
Tầng phiên (Session Layer):
đóng và mở luồng giao tiếp giữa hai thiết bị
cung cấp dịch vụ đánh dấu điểm hoàn thành
Transport Layer: thiết lập kết nối giữa hai thiết bị
dịch vụ kiểm soát luồng và kiểm soát lỗi
dữ liệu được chuyển đi được chính xác và không quá tải bên nhận
Network Layer:dữ liệu có thể truyền giữa các thiết bị ở khác mạng
xác định đường truyền tốt nhất
Data Link Layer: giống network, truyền dữ liệu trong cùng mạng
Physical Layer:các thiết bị phần cứng, truyền dữ liệu, 01
Ưu điểm:
Mỗi tầng có 1 cấu trúc và chức năng riêng nên dễ dàng xây dựng và sửa chữa.
Có thể tích hợp trong nhiều mạng lưới khác nhau.
tcp/tp
app
Transport Layer:2 thiết bị nguồn đích, kiểm soát luồng
TCP và UDP
internet layer: giúp data điểm đầu đến điểm đích an toàn
Network Access Layer: Tầng liên kết nhận dữ liệu dưới dạng bit
sau đó đưa dữ liệu vào trong 1 gói dữ liệu
rồi gửi lên mạng lưới máy tính để truyền đến điểm đích.
- hoạt động đập lập với hệ điều hành
- -Khó khăn trong việc thay thế các giao thức mới.
Một tầng có nhiều chức năng nên phức tạp hơn so với mô hình OSI.
-----------------------------
Điểm giống nhau giữa các mô hình tham chiếu OSI và TCP / IP
Cả hai mô hình tham chiếu đều dựa trên kiến ​​trúc phân lớp.
Các lớp trong mô hình được so sánh với nhau. Lớp vật lý và lớp liên kết dữ liệu của mô hình OSI tương ứng với lớp liên kết của mô hình TCP / IP. Các lớp mạng và các lớp truyền tải giống nhau trong cả hai mô hình. Lớp phiên, lớp trình bày và lớp ứng dụng của mô hình OSI cùng nhau tạo thành lớp ứng dụng của mô hình TCP / IP.
Trong cả hai mô hình, các giao thức được xác định theo cách khôn ngoan theo lớp.
Trong cả hai mô hình, dữ liệu được chia thành các gói và mỗi gói có thể đi theo tuyến đường riêng lẻ từ nguồn đến đích.
Sự khác biệt giữa các mô hình tham chiếu OSI và TCP / IP
Độ tin cậy chung: TCP/IP được coi là một lựa chọn đáng tin cậy hơn so với mô hình OSI. Trong hầu hết các trường hợp, mô hình OSI được gọi là công cụ tham khảo.
Tính bảo mật: OSI cũng được biết đến với giao thức và ranh giới chặt chẽ. TCP/IP cho phép “nới lỏng” các quy tắc, cung cấp các nguyên tắc chung được đáp ứng.
Về phương pháp tiếp cận: TCP/IP thực hiện cách tiếp cận theo chiều ngang còn mô hình OSI thực hiện cách tiếp cận theo chiều dọc.
Mô hình phân tầng: TCP/IP kết hợp tầng phiên và tầng trình diễn trong tầng ứng dụng. Dường như OSI có một cách tiếp cận khác nhau, có các tầng khác nhau và mỗi tầng chỉ thực hiện một chức năng riêng.
Thiết kế mô hình: Trong TCP/IP, các giao thức được thiết kế đầu tiên và sau đó mô hình được phát triển. Trong OSI, việc phát triển mô hình xảy ra trước và sau đó là phát triển giao thức.
Về truyền thông: TCP/IP chỉ hỗ trợ truyền thông không kết nối phát ra từ tầng mạng. Ngược lại dường như OSI làm điều này khá tốt, hỗ trợ cả kết nối không dây và kết nối theo định tuyến trong tầng mạng.
-------------------------------------
TCP/IP
Tầng 4: Application của TCP/IP là gì?
Tầng Application hay còn gọi là tầng ứng dụng. Tầng ứng dụng đảm nhận vai trò giao tiếp dữ liệu giữa 2 máy khác nhau thông qua các dịch vụ mạng khác nhau (duyệt web, chay hay các giao thức trao đổi dữ liệu SMTP, SSH, FTP…). Dữ liệu khi đến được tầng 4 sẽ được định dạng để kết nối theo kiểu Byte nối Byte. Các thông tin định tuyến tại đây sẽ giúp xác định đường đi đúng của một gói tin.

Tầng 3: Transport của TCP/IP là gì?
Tầng dữ liệu hoạt động thông qua hai giao thức chính là TCP (Transmisson Control Protocol) và UDP (User Datagram Protocol).

TCP sẽ đảm bảo chất lượng truyền gửi gói tin, tuy nhiên lại mất thời gian khá lâu để thực hiện các thủ tục kiếm soát dữ liệu. Ngược lại, UDP lại cho tốc độ truyền tải nhanh nhưng lại không đảm bảo được chất lượng dữ liệu. Ở tầng này, TCP và UDP sẽ hỗ trợ nhau phân luồng dữ liệu.

Tầng 2: Internet (Tầng mạng)
Tầng Internet đảm nhận việc truyền tải dữ liệu một cách hợp lý. Các giao thức của tầng này bao gồm IP (Internet Protocol), ICMP (Internet Control Message Protocol), IGMP (Internet Group Message Protocol).

Tầng 1: Physical (Tầng vật lý)
Tầng vật lý (còn được gọi là tầng liên kết dữ liệu) là tầng thấp nhất trong mô hình TCP/IP. Tầng này chịu trách nhiệm truyền dữ liệu giữa hai thiết bị trong cùng một mạng. Tại đây, các gói dữ liệu được đóng vào khung (gọi là Frame) và được định tuyến đi đến đích đã được chỉ định ban đầu.




java
------------------------------------------------------
Tính đóng gói (encapsulation) và che giấu thông tin (information hiding) :

Tức là trạng thái của đối tượng được bảo vệ không cho các truy cập từ code bên ngoài như thay đổi trong thái hay nhìn trực tiếp. Việc cho phép môi trường bên ngoài tác động lên các dữ liệu nội tại của một đối tượng theo cách nào là hoàn toàn tùy thuộc vào người viết mã. Đây là tính chất đảm bảo sự toàn vẹn, bảo mật của đối tượng Trong Java, tính đóng gói được thể hiện thông qua phạm vi truy cập (access modifier). Ngoài ra, các lớp liên quan đến nhau có thể được gom chung lại thành package.
Tính kế thừa là khả năng cho phép ta xây dựng một lớp mới dựa trên các định nghĩa của một lớp đã có. Lớp đã có gọi là lớp Cha, lớp mới phát sinh gọi là lớp Con và đương nhiên kế thừa tất cả các thành phần của lớp Cha, có thể chia sẻ hay mở rộng các đặc tính sẵn có mà không phải tiến hành định nghĩa lại.

Tính đa hình (polymorphism):

Khi một tác vụ được thực hiện theo nhiều cách khác nhau được gọi là tính đa hình.
Đối với tính chất này, nó được thể hiện rõ nhất qua việc gọi phương thức của đối tượng. Các phương thức hoàn toàn có thể giống nhau, nhưng việc xử lý luồng có thể khác nhau. Nói cách khác: Tính đa hình cung cấp khả năng cho phép người lập trình gọi trước một phương thức của đối tượng, tuy chưa xác định đối tượng có phương thức muốn gọi hay không. Đến khi thực hiện (run-time), chương trình mới xác định được đối tượng và gọi phương thức tương ứng của đối tượng đó. Kết nối trễ giúp chương trình được uyển chuyển hơn, chỉ yêu cầu đối tượng cung cấp đúng phương thức cần thiết là đủ.
Trong Java, chúng ta sử dụng nạp chồng phương thức (method overloading) và ghi đè phương thức (method overriding) để có tính đa hình.
Nạp chồng (Overloading): Đây là khả năng cho phép một lớp có nhiều thuộc tính, phương thức cùng tên nhưng với các tham số khác nhau về loại cũng như về số lượng. Khi được gọi, dựa vào tham số truyền vào, phương thức tương ứng sẽ được thực hiện.
Ghi đè (Overriding): là hai phương thức cùng tên, cùng tham số, cùng kiểu trả về nhưng thằng con viết lại và dùng theo cách của nó, và xuất hiện ở lớp cha và tiếp tục xuất hiện ở lớp con. Khi dùng override, lúc thực thi, nếu lớp Con không có phương thức riêng, phương thức của lớp Cha sẽ được gọi, ngược lại nếu có, phương thức của lớp Con được gọi.
Tính trừu tượng (abstraction):

Tính trừu tượng là một tiến trình ẩn các chi tiết trình triển khai và chỉ hiển thị tính năng tới người dùng. Tính trừu tượng cho phép bạn loại bỏ tính chất phức tạp của đối tượng bằng cách chỉ đưa ra các thuộc tính và phương thức cần thiết của đối tượng trong lập trình.
Tính trừu tượng giúp bạn tập trung vào những cốt lõi cần thiết của đối tượng thay vì quan tâm đến cách nó thực hiện.
Trong Java, chúng là sử dụng abstract class và abstract interface để có tính trừu tượng.

ctdl
Thuật toán Dijkstra có thể giải quyết bài toán tìm đường đi ngắn nhất trên đồ thị vô hướng lẫn có hướng miễn là trọng số không âm.

Ý tưởng cơ bản của thuật toán như sau:

Bước 1: Từ đỉnh gốc, khởi tạo khoảng cách tới chính nó là 00, khởi tạo khoảng cách nhỏ nhất ban đầu tới các đỉnh khác là +\infty+∞. Ta được danh sách các khoảng cách tới các đỉnh.
Bước 2: Chọn đỉnh a có khoảng cách nhỏ nhất trong danh sách này và ghi nhận. Các lần sau sẽ không xét tới đỉnh này nữa.
Bước 3: Lần lượt xét các đỉnh kề b của đỉnh a. Nếu khoảng cách từ đỉnh gốc tới đỉnh b nhỏ hơn khoảng cách hiện tại đang được ghi nhận thì cập nhật giá trị và đỉnh kề a vào khoảng cách hiện tại của b.
Bước 4: Sau khi xét tất cả đỉnh kề b của đỉnh a. Lúc này ta được danh sách khoảng cách tới các điểm đã được cập nhật. Quay lại Bước 2 với danh sách này. Thuật toán kết thúc khi chọn được khoảng cách nhỏ nhất từ tất cả các điểm
--------------------------------------------
Tạo một mảng CE để ghi đường đi và một stack để xếp các đỉnh ta sẽ xét. Xếp vào đó một đỉnh tuỳ ý u nào đó của đồ thị, nghĩa là đỉnh u sẽ được xét đầu tiên.

*Xét đỉnh trên cùng của ngăn xếp, giả sử đỉnh đó là đỉnh v và thực hiện:

Nếu v là đỉnh cô lập thì lấy v khỏi ngăn xếp và đưa vào CE;
Nếu v là liên thông với đỉnh x thì xếp x vào ngăn xếp sau đó xoá bỏ cạnh (v, x);
*Quay lại bước 2 cho tới khi ngăn xếp rỗng. Kết quả chu trình Euler được chứa trong CE theo thứ tự ngược lại.
----------------------------------------------
Stack là một cấu trúc dữ liệu hoạt động theo nguyên tắc Last In First Out. Hiểu đơn giản là phần tử sẽ được thêm vào cuối stack và khi lấy ra ta cũng sẽ lấy phần tử cuối stack (phần tử được thêm vào gần nhất).

Một ví dụ trong thực tế của stack mà các bạn có thể dễ hình dung được đó chính là hộp cầu lông. Khi muốn cho cầu vào trong hộp ta sẽ cho cầu vào đáy hộp cầu và khi muốn lấy cầu ra thì ta sẽ lấy quả cầu gần nhất được cho vào.
Một stack sẽ hỗ trợ các thao tác cơ bản sau:

Thêm phần tử vào cuối stack
Loại bỏ phần tử cuối ra khỏi stack
Lấy giá trị cuối trong stack
Lấy kích thước stack
Các phương thức cơ bản trong stack của C++:

push: Thêm phần tử vào cuối stack
pop: Loại bỏ phần tử cuối stack
top: Trả về giá trị là phần tử cuối trong stack
size: Trả về giá trị nguyên là số phần tử đang có trong stack
empty: Trả về một giá trị bool, true nếu stack rỗng, false nếu stack không rỗng
Các phương thức trên sẽ đều mất độ phức tạp O(1).
Chuyển đổi số thập phân sang nhị phân: Khi chuyển đổi số thập phân sang nhị phân, chúng ta sẽ thưc hiện thao tác chia số thập phân này cho 2 và viết phần dư ngược lại thứ tự mà nó được sinh ra. Sử dụng stack, ta lưu lần lượt phần dư sau mỗi lần chia và sau khi kết thúc thao tác chia, đọc stack vừa rồi sẽ cho ra biểu diễn nhị phân cần tìm.
Tính giá trị biểu thức đại số hậu tố: Biểu thức đại số hậu tố là biểu thức có toán tử nằm sau 2 toán hạng của nó, cũng không có dấu ngoặc. Ví dụ như biểu thức hậu tố của ((4 + 2) / 3) + 5 sẽ là 4 2 + 3 / 5 +. Đầu tiên, duyệt biểu thức theo thứ tự từ trái sang phải, khi gặp toán hạng thì đẩy vào stack. Sau đó, khi gặp toán tử, ta lấy 2 toán hạng trên cùng trong stack ra và thực hiện phép toán rồi lại đẩy kết quả vào stack. Đối với ví dụ này, các thao tác được thực hiện là:
-------------------------------------------------
Queue:
Có thể xem hàng đợi (queue) là một kiểu danh sách có 2 phép toán đặc trưng là:

Bổ sung một phần tử vào cuối danh sách (rear)
Loại bỏ một phần tử ở đầu danh sách (front)
Một số thao tác thông dụng trên queue như:

enqueue(): thêm một phần tử vào queue.
dequeue(): loại bỏ một phần tử ra khỏi queue.
isFull(): kiểm tra queue có đầy chưa. Số lượng phần tử trong queue do người dùng quy định. Tùy trường hợp chúng ta mới cần sử dụng hàm isFull().
isEmpty(): kiểm tra queue có rỗng hay không.
Trong lập trình, có 2 cách thường dùng để xây dựng queue là sử dụng mảng (array) và danh sách liên kết (linked list).
-------------------------------------------
Sự khác biệt giữa Array và ArrayList trong Java
Việc so sánh Array và ArrayList trong Java sẽ dựa trên một số tham số khiến bạn dễ dàng hiểu được sự khác biệt giữa chúng. Giờ thì cùng xem sự khác biệt của cả hai qua những yếu tố dưới đây:

Về bản chất sự khác biệt giữa Array và ArrayList 
Array trong Java có bản chất tĩnh, tức là chúng ta không thể thay đổi độ dài của chúng. Chiều dài của mảng là cố định. Khi chúng ta khai báo độ dài tại thời điểm tạo mảng, chúng ta không thể thay đổi kích thước của chúng.

Mặt khác, ArrayList trong Java có bản chất động, do đó đôi khi chúng ta có thể gọi nó là mảng động hoặc mảng có thể thay đổi. ArrayList có thể tự động tăng kích thước nếu chúng ta thêm nhiều giới hạn vượt quá khả năng xác định của nó, do đó nó có bản chất động.

Về thực thi Array và ArrayList
Một mảng là một đặc trưng cơ bản của Java, trong khi ArrayList là một phần của nền tảng tập hợp API trong Java. ArrayList trong Java được thực thi nội bộ bằng cách sử dụng Array. ArrayList là một lớp mang tất cả các thuộc tính của một lớp bình thường, chúng ta có thể tạo các đối tượng từ nó và gọi các phương thức với đối tượng. Mặc dù Mảng là một đối tượng trong Java nhưng không có phương thức nào mà chúng ta có thể gọi bằng đối tượng này. Một mảng chỉ có một thuộc tính duy nhất được gọi là độ dài length và cũng là một hằng số.

>>> Đọc thêm: Lớp trừu tượng trong Java - Nắm vững khái niệm về Abstract trong Java

Về hiệu suất Array và ArrayList
Vì ArrayList hoạt động nội bộ dựa trên mảng, có thể bạn sẽ nghĩ rằng hiệu suất của chúng tương đương nhau. Về cơ bản, việc này có thể được xem là đúng nhưng hiệu suất của ArrayList có thể chậm hơn khi so sánh với Arrays vì nó có thêm một số tính năng so với Array. Hiệu suất của ArrayList ảnh hưởng chủ yếu xét về thời gian chạy của CPU và cách sử dụng bộ nhớ. 

Bất kỳ hoạt động resize () nào trên ArrayList có thể làm giảm hiệu suất của ArrayList vì nó liên quan đến việc tạo mảng mới và sau đó sao chép nội dung từ mảng cũ sang mảng mới. Do đó, thao tác này làm chậm hiệu suất của ArrayList.

Về tính linh hoạt Array và ArrayList
Tính linh hoạt là yếu tố quan trọng nhất tạo nên sự khác biệt đáng kể giữa Array và ArrayList trong Java. ArrayList linh hoạt hơn so với Arrays trong Java. Điều này là do ArrayList có bản chất động. ArrayList có thể tự động phát triển khi các phần tử được thêm vào vượt quá khả năng của nó, điều này không thể xảy ra với Array. Hơn nữa, ArrayList còn cho phép chúng ta loại bỏ các phần tử khỏi nó trong khi điều đó là không thể với Array. Chúng ta không thể xóa các phần tử khỏi một mảng sau khi thêm chúng.

Ví dụ:
-----------------
Một Linked List (danh sách liên kết) sẽ được biểu diễn bởi một con trỏ (pointer) trỏ đến node đầu tiên của Linked List đó. Node đầu tiên của Linked List được gọi là node head. Nếu Linked List là trống, giá trị của node head sẽ là NULL.

Mỗi node ở bên trong một Linked List sẽ bao gồm ít nhất hai thành phần sau:

1. data (dữ liệu, có thể là kiểu số, kiểu ký tự, …)

2. pointer (con trỏ) hoặc có thể hiểu là reference (tham chiếu) tới node tiếp theo trong Linked List.

---
 Sắp xếp chèn (Insertion Sort):
Ý tưởng: Insertion Sort lấy ý tưởng từ việc chơi bài, dựa theo cách người chơi "chèn" thêm một quân bài mới vào bộ bài đã được sắp xếp trên tay.

Thuật toán:

Tại bước k = 1, 2, ..., n đưa phần tử thứ k trong mảng đã cho vào đúng vị trí trong dãy gồm k phần tử đầu tiên.
Kết quả là sau bước thứ k, sẽ có k phần tử đầu tiên được sắp xếp theo thứ tự.
Đây là thuật toán cơ bản nhất cho việc sắp xếp.
------------------------------------------------------------
Bubble Sort

Ý tưởng
Xét lần lượt các cặp 2 phần tử liên tiếp. Nếu phần tử đứng sau nhỏ hơn phần tử đứng trước, ta đổi chỗ 2 phần tử. Nói cách khác, phần tử nhỏ nhất sẽ nổi lên trên.
Lặp lại đến khi không còn 2 phần tử nào thỏa mãn. Có thể chứng minh được số lần lặp không quá N−1, do một phần tử chỉ có thể nổi lên trên không quá N−1 lần.
Ưu điểm
Code đơn giản, dễ hiểu
Không tốn thêm bộ nhớ
Nhược điểm
Độ phức tạp O(N2), không đủ nhanh với dữ liệu lớn.
Code
for (int i = 0; i < n; i++)
	for (int j = 0; j < n - 1; j++)
		if (a[j] > a[j+1]) {
			swap(a[j], a[j+1]);
		}
Minh họa
Bạn có thể vào VisuAlgo.

Chọn Bubble ở thanh menu bên trên.
Ấn vào nút Create ở phía dưới trang để tạo một dãy mới
Ấn vào Sort, rồi Go để chạy thuật toán.
----------------------------------------------------------------------
Sắp xếp chèn (Insertion Sort)
Ý tưởng
Ý tưởng chính của thuật toán là ta sẽ sắp xếp lần lượt từng đoạn gồm 1 phần tử đầu tiên, 2 phần tử đầu tiên, …, N phần tử.

Giả sử ta đã sắp xếp xong i phần tử của mảng. Để sắp xếp i+1 phần tử đầu tiên, ta tìm vị trí phù hợp của phần tử thứ i+1 và "chèn" nó vào đó.

Ưu điểm
Nếu danh sách đã gần đúng thứ tự, Insertion Sort sẽ chạy rất nhanh. Ví dụ bạn cần sắp xếp Highscore trong game.
Nhược điểm
Độ phức tạp O(N2), không đủ nhanh với dữ liệu lớn.
Code
for (int i = 1; i < n; i++) {
	// Tìm vị trí phù hợp cho i
	int j = i;
	while (j > 0 && data[i] < data[j-1]) --j;

	// Đưa i về đúng vị trí
	int tmp = data[i];
	for (int k = i; k > j; k--)
		data[k] = data[k-1];
	data[j] = tmp;
}
Minh họa
Bạn có thể vào VisuAlgo.

Chọn Insert ở thanh menu bên trên.
Ấn vào nút Create ở phía dưới trang để tạo một dãy mới
Ấn vào Sort, rồi Go để chạy thuật toán.
--------------------------------------------------------------
Sắp xếp trộn (Merge sort)
Ý tưởng
Sắp xếp trộn hoạt động kiểu đệ quy:

Đầu tiên chia dữ liệu thành 2 phần, và sắp xếp từng phần.
Sau đó gộp 2 phần lại với nhau. Để gộp 2 phần, ta làm như sau:
Tạo một dãy A mới để chứa các phần tử đã sắp xếp.
So sánh 2 phần tử đầu tiên của 2 phần. Phần tử nhỏ hơn ta cho vào A và xóa khỏi phần tương ứng.
Tiếp tục như vậy đến khi ta cho hết các phần tử vào dãy A.
Ưu điểm
Chạy nhanh, độ phức tạp O(N∗logN).
Ổn định
Nhược điểm
Cần dùng thêm bộ nhớ để lưu mảng A.
Code
int a[MAXN]; // mảng trung gian cho việc sắp xếp

// Sắp xếp các phần tử có chỉ số từ left đến right của mảng data.
void mergeSort(int data[MAXN], int left, int right) {
	if (data.length == 1) {
		// Dãy chỉ gồm 1 phần tử, ta không cần sắp xếp.
		return ;
	}
	int mid = (left + right) / 2;
	// Sắp xếp 2 phần
	mergeSort(data, left, mid);
	mergeSort(data, mid+1, right);

	// Trộn 2 phần đã sắp xếp lại
	int i = left, j = mid + 1; // phần tử đang xét của mỗi nửa
	int cur = 0; // chỉ số trên mảng a

	while (i <= mid || j <= right) { // chừng nào còn 1 phần chưa hết phần tử.
		if (i > mid) {
			// bên trái không còn phần tử nào
			a[cur++] = data[j++];
		} else if (j > right) {
			// bên phải không còn phần tử nào
			a[cur++] = data[i++];
		} else if (data[i] < data[j]) {
			// phần tử bên trái nhỏ hơn
			a[cur++] = data[i++];
		} else {
			a[cur++] = data[j++];
		}
	}

	// copy mảng a về mảng data
	for (int i = 0; i < cur; i++)
		data[left + i] = a[i];
}
Minh họa
Bạn có thể vào VisuAlgo.

Chọn Merge ở thanh menu bên trên.
Ấn vào nút Create ở phía dưới trang để tạo một dãy mới
Ấn vào Sort, rồi Go để chạy thuật toán.
-------------------------------------------
Sắp xếp vun đống (HeapSort)
Ý tưởng
Ta lưu mảng vào CTDL Heap.

Ở mỗi bước, ta lấy ra phần tử nhỏ nhất trong heap, cho vào mảng đã sắp xếp.

Ưu điểm
Cài đặt đơn giản nếu đã có sẵn thư viện Heap.
Chạy nhanh, độ phức tạp O(N∗logN).
Nhược điểm
Không ổn định
Code
Heap h = Heap();
for (int i = 0; i < n; i++) {
	// thêm phần tử vào heap
	h.push(data[i]);
}
int a[MAXN];
for (int i = 0; i < n; i++) {
	// lấy phần tử nhỏ nhất và cho vào mảng đã sắp xếp
	a[i] = h.pop();
}
---------------------------------------------
Sắp xếp nhanh (QuickSort)
Ý tưởng
Chia dãy thành 2 phần, một phần "lớn" và một phần "nhỏ".
Chọn một khóa pivot
Những phần tử lớn hơn pivot chia vào phần lớn
Những phần tử nhỏ hơn hoặc bằng pivot chia vào phần nhỏ.
Gọi đệ quy để sắp xếp 2 phần.
Ưu điểm
Chạy nhanh (nhanh nhất trong các thuật toán sắp xếp dựa trên việc só sánh các phần tử). Do đó quicksort được sử dụng trong nhiều thư viện của các ngôn ngữ như Java, C++ (hàm sort của C++ dùng Intro sort, là kết hợp của Quicksort và Insertion Sort).
Nhược điểm
Tùy thuộc vào cách chia thành 2 phần, nếu chia không tốt, độ phức tạp trong trường hợp xấu nhất có thể là O(N2). Nếu ta chọn pivot ngẫu nhiên, thuật toán chạy với độ phức tạp trung bình là O(N∗logN) (trong trường hợp xấu nhất vẫn là O(N2), nhưng ta sẽ không bao giờ gặp phải trường hợp đó).
Không ổn định.
Code
void quickSort(int a[], int left, int right) {
	int i = left, j = right;
	int pivot = a[left + rand() % (right - left)];
	// chia dãy thành 2 phần
	while (i <= j) {
		while (a[i] < pivot) ++i;
		while (a[j] > pivot) --j;

		if (i <= j) {
			swap(a[i], a[j]);
			++i;
			--j;
		}
	}
	// Gọi đệ quy để sắp xếp các nửa
	if (left < j) quickSort(a, left, j);
	if (i < right) quickSort(a, i, right);
}
Minh họa
Bạn có thể vào VisuAlgo.

Chọn Quick ở thanh menu bên trên.
Ấn vào nút Create ở phía dưới trang để tạo một dãy mới
Ấn vào Sort, rồi Go để chạy thuật toán.
-------------------------------------------
Sắp xếp cơ số (RadixSort)
Ý tưởng
Khác với tất cả các thuật toán nêu trên, RadixSort không sử dụng việc so sánh 2 phần tử.

Đầu tiên, thuật toán sẽ chia các phần tử thành các nhóm, dựa trên chữ số cuối cùng (hoặc dựa theo bit cuối cùng, hoặc vài bit cuối cùng).
Sau đó ta đưa các nhóm lại với nhau, và được danh sách sắp xếp theo chữ số cuối của các phần tử. Quá trình này lặp đi lặp lại với chữ số át cuối cho tới khi tất cả vị trí chữ số đã sắp xếp.
Ưu điểm
Có thể chạy nhanh hơn các thuật toán sắp xếp sử dụng so sánh. Ví dụ nếu ta sắp xếp các số nguyên 32 bit, và chia nhóm theo 1 bit, thì độ phức tạp là O(N). Trong trường hợp tổng quát, độ phức tạp là O(N∗log(max(ai)))
