package cz.mg.vulkan;

public class VkDeviceQueueGlobalPriorityCreateInfoEXT extends VkObject {
    public VkDeviceQueueGlobalPriorityCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_EXT));
    }

    public VkDeviceQueueGlobalPriorityCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceQueueGlobalPriorityCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkQueueGlobalPriorityEXT getGlobalPriority() {
        return new VkQueueGlobalPriorityEXT(getVkMemory(), getGlobalPriority(getVkAddress()));
    }

    
    public void setGlobalPriority(VkQueueGlobalPriorityEXT globalPriority) {
        setGlobalPriority(getVkAddress(), globalPriority != null ? globalPriority.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setGlobalPriority(int globalPriority) {
        getGlobalPriority().setValue(globalPriority);
    }

    private static native long getGlobalPriority(long address);
    private static native void setGlobalPriority(long address, long globalPriority);


    public static native long sizeof();

    public static class Array extends VkDeviceQueueGlobalPriorityCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueGlobalPriorityCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceQueueGlobalPriorityCreateInfoEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceQueueGlobalPriorityCreateInfoEXT o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDeviceQueueGlobalPriorityCreateInfoEXT get(int i){
            return new VkDeviceQueueGlobalPriorityCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkDeviceQueueGlobalPriorityCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueGlobalPriorityCreateInfoEXT.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
                this.count = count;
            }

            public Array(VkMemory vkmemory, int count) {
                super(vkmemory);
                this.count = count;
            }

            public Array(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress);
                this.count = count;
            }

            public Array(VkDeviceQueueGlobalPriorityCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceQueueGlobalPriorityCreateInfoEXT.Pointer get(int i){
                return new VkDeviceQueueGlobalPriorityCreateInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
