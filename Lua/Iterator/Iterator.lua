SortMethod = {}
SortMethod.__index = SortMethod

function SortMethod:New()
  local instance = setmetatable(self, {})
  return instance
end

function SortMethod:sort(arr)
  for i = 1, #arr do
    for j = 1, #arr do
      local k = j + 1
      if j == #arr then
        break
      elseif arr[j] > arr[k] then
        local aux = arr[j]
        arr[j] = arr[k]
        arr[k] = aux
      end
    end
  end
  
  return arr
end

Class = {}
Class.__index = Class

function Class:New(arr, sm)
  local instance = setmetatable(self, {})
  instance.array = arr or nil
  instance.sortMethod = sm or nil
  return instance
end

function Class:getArray()
  if self.array == nil then
    print('There is no array')
  else
    return self.array
  end
end

function Class:sort()
  if self.sortMethod == nil then
    print('There is no sort method')
  else
    return self.sortMethod:sort(self:getArray())
  end
end


array = {5, 4, 3, 2, 1}
normal = SortMethod:New()
test = Class:New(array, normal)

sorted = test:sort()
for i = 1, #sorted do
  print(sorted[i])
end