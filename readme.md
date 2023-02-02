
## ERDiagram

``` mermaid
erDiagram
Category ||--o{Ingredient: contains
Category{
int category_id PK
string name_category
}
Ingredient{
  int ingredient_id PK
  string name_ingredient 
  int calories  
  float proteins 
  float fats 
  float carbohydrates 
  int category_id FK  }