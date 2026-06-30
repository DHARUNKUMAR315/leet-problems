select player_id,min(event_date) as First_login
from Activity
group by player_id;