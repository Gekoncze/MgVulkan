package cz.mg.vulkan;

public class VkPhysicalDeviceProtectedMemoryProperties extends VkObject {
    public VkPhysicalDeviceProtectedMemoryProperties() {
        super(sizeof());
    }

    public VkPhysicalDeviceProtectedMemoryProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceProtectedMemoryProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkBool32 getProtectedNoFault() {
        return new VkBool32(getVkMemory(), getProtectedNoFault(getVkAddress()));
    }

    
    public void setProtectedNoFault(VkBool32 protectedNoFault) {
        setProtectedNoFault(getVkAddress(), protectedNoFault != null ? protectedNoFault.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getProtectedNoFault(long address);
    private static native void setProtectedNoFault(long address, long protectedNoFault);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceProtectedMemoryProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceProtectedMemoryProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceProtectedMemoryProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceProtectedMemoryProperties o){
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
        public VkPhysicalDeviceProtectedMemoryProperties get(int i){
            return new VkPhysicalDeviceProtectedMemoryProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceProtectedMemoryProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceProtectedMemoryProperties.Pointer> {
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

            public Array(VkPhysicalDeviceProtectedMemoryProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceProtectedMemoryProperties.Pointer get(int i){
                return new VkPhysicalDeviceProtectedMemoryProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
