def test3(x)
  first_side = x-1
  number_x = 1

  (1..x).each do |i|
    puts ("0" * first_side) + ("X"* number_x) +  ("0" * first_side) 
    first_side -= 1
    number_x +=2
  end
end