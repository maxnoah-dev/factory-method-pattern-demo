# Factory Method and Related Patterns (Java)

## Câu 1 - Refactor về Factory Method
- Main class: `bai1.Main`
- Mục tiêu: thay khối `if/else` tạo hình bằng `ShapeFactory` + concrete factory.

## Câu 2 - Dùng pattern phù hợp cho sắp xếp
- Main class: `bai2.SortApp`
- Pattern: `Strategy`
- Mục tiêu: tách các thuật toán sắp xếp khỏi `SortedList`, để thay đổi linh hoạt khi runtime.

## Câu 3 - Ứng dụng vẽ hình bằng chuột (áp dụng kết quả Câu 1)
- Main class: `bai3.DrawingApp`
- Giải pháp: Swing + Factory Method tạo hình theo loại hình và style (outline/solid).

## Câu 4 - Mở rộng nét đứt/nét liền, tô/không tô
- Package: `bai4`
- Main class: `bai4.AdvancedDrawingApp`
- Giải pháp:
  - Factory Method để tạo shape
  - Bridge/Strategy cho style vẽ (`StrokeStyle`, `FillStyle`) để kết hợp linh hoạt

## Compile và run
Yêu cầu: JDK 8+.

```powershell
Set-Location "d:\Home\Documents\HK2\DesignPattern\LabExercises\521H0476_Lab04"
$files = Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -d out $files
```

Run từng bài:

```powershell
java -cp out bai1.Main
java -cp out bai2.SortApp
java -cp out bai3.DrawingApp
java -cp out bai4.AdvancedDrawingApp
```
