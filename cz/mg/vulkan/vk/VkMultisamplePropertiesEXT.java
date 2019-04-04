package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMultisamplePropertiesEXT.html">khronos documentation</a>
 **/
public class VkMultisamplePropertiesEXT extends VkObject {
    public VkMultisamplePropertiesEXT() {
        super(sizeof());
    }

    public VkMultisamplePropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMultisamplePropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkMultisamplePropertiesEXT(VkStructureType sType, VkObject pNext, VkExtent2D maxSampleLocationGridSize) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setMaxSampleLocationGridSize(maxSampleLocationGridSize);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
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

    public VkExtent2D getMaxSampleLocationGridSize() {
        return new VkExtent2D(getVkMemory(), getMaxSampleLocationGridSize(getVkAddress()));
    }

    
    public void setMaxSampleLocationGridSize(VkExtent2D maxSampleLocationGridSize) {
        setMaxSampleLocationGridSize(getVkAddress(), maxSampleLocationGridSize != null ? maxSampleLocationGridSize.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxSampleLocationGridSize(long address);
    private static native void setMaxSampleLocationGridSize(long address, long maxSampleLocationGridSize);


    public static native long sizeof();

    public static class Array extends VkMultisamplePropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkMultisamplePropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMultisamplePropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMultisamplePropertiesEXT o){
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
        public VkMultisamplePropertiesEXT get(int i){
            return new VkMultisamplePropertiesEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMultisamplePropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMultisamplePropertiesEXT.Pointer> {
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

            public Array(VkMultisamplePropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMultisamplePropertiesEXT.Pointer get(int i){
                return new VkMultisamplePropertiesEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
