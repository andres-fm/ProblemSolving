import qualified Data.Set as Set
import Data.Set (Set)

reduction :: String -> Set Char -> String
reduction [] _ = []
reduction (x:ys) set
                  | Set.member x set = reduction(ys) set 
                  | otherwise = x:reduction(ys) ((Set.insert x) set)

main = do string <- getLine
          putStr(reduction string Set.empty)
            
            
            
            
