# <h1 style="color:pink" align="center"> Geometrical Shapes Drawing Project</h1>

## <span style="color:lightblue">Overview</span>
This project is an exercise in **object-oriented programming with Java**.  
The goal is to create and manipulate geometric shapes (Point, Line, Rectangle, Triangle, Circle, etc.), draw them on an image, and save the result as a file.  

The image where we drew the shapes :            
<img src="./image.png" alt="Shapes" width="60%"/>

It is built around two main interfaces:
- **Drawable**: defines how a shape is drawn.
- **Displayable**: defines how the drawing surface (Image) displays and saves pixels.

## <span style="color:lightblue">Project Structure</span>
```
├── Main.java
├── geometrical_shapes/
│ ├── Drawable.java
│ ├── Displayable.java
│ ├── Point.java
│ ├── Line.java
│ ├── Triangle.java
│ ├── Rectangle.java
│ ├── Circle.java
│ ├── Pentagon.java (bonus)
│ └── Cube.java (bonus)
└── image/
└── Image.java
```


## <span style="color:lightblue">Compilation & Run</span>

```sh
    javac -d build Main.java
    java -cp build Main
```

## <span style="color:lightblue">Collaborators</span>

[Hasnae Lamrani](https://learn.zone01oujda.ma/git/hlamrani)            
[Ndiasse Dieye](https://learn.zone01oujda.ma/git/ndieye)           
[Youssef JAOUHAR](https://learn.zone01oujda.ma/git/yojaouhar)         
