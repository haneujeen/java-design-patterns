The iterator pattern is a design pattern that provides a way to access the elements 
of an aggregate object sequentially without exposing its underlying representation. 
It's often used in programming for various practical use cases, e.g. 
iterators in programming languages are them:
```agsl
List<String> post = Arrays.asList("34", "rue", "baudin");
Iterator<String> it = post.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```
```agsl
#include <vector>
#include <iostream>

int main() {
    std::vector<int> address = {1, 2, 3, 4, 5};
    for (auto it = address.begin(); it != address.end(); ++it) {
        std::cout << *it << std::endl;
    }
    return 0;
}
```