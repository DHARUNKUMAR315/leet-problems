select x,y,z,
CASE
when x+y>z and  y+z>x and z+x >y then 'Yes'
else 'No'
end as triangle
from triangle
