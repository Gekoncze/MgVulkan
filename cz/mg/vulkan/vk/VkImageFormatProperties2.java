package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageFormatProperties2.html">khronos documentation</a>
 **/
public class VkImageFormatProperties2 extends VkObject {
    public VkImageFormatProperties2() {
        super(sizeof());
    }

    public VkImageFormatProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageFormatProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageFormatProperties2(VkStructureType sType, VkObject pNext, VkImageFormatProperties imageFormatProperties) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setImageFormatProperties(imageFormatProperties);
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

    public VkImageFormatProperties getImageFormatProperties() {
        return new VkImageFormatProperties(getVkMemory(), getImageFormatProperties(getVkAddress()));
    }

    
    public void setImageFormatProperties(VkImageFormatProperties imageFormatProperties) {
        setImageFormatProperties(getVkAddress(), imageFormatProperties != null ? imageFormatProperties.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getImageFormatProperties(long address);
    private static native void setImageFormatProperties(long address, long imageFormatProperties);


    public static native long sizeof();

    public static class Array extends VkImageFormatProperties2 implements cz.mg.collections.array.ReadonlyArray<VkImageFormatProperties2> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageFormatProperties2.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageFormatProperties2 o){
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
        public VkImageFormatProperties2 get(int i){
            return new VkImageFormatProperties2(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkImageFormatProperties2.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkImageFormatProperties2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
