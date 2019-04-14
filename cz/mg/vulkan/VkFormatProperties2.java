package cz.mg.vulkan;

public class VkFormatProperties2 extends VkObject {
    public VkFormatProperties2() {
        super(sizeof());
    }

    public VkFormatProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFormatProperties2(VkMemory vkmemory, long vkaddress) {
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

    public VkFormatProperties getFormatProperties() {
        return new VkFormatProperties(getVkMemory(), getFormatProperties(getVkAddress()));
    }

    
    public void setFormatProperties(VkFormatProperties formatProperties) {
        setFormatProperties(getVkAddress(), formatProperties != null ? formatProperties.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getFormatProperties(long address);
    private static native void setFormatProperties(long address, long formatProperties);


    public static native long sizeof();

    public static class Array extends VkFormatProperties2 implements cz.mg.collections.array.ReadonlyArray<VkFormatProperties2> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFormatProperties2.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFormatProperties2 o){
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
        public VkFormatProperties2 get(int i){
            return new VkFormatProperties2(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkFormatProperties2.Pointer implements cz.mg.collections.array.ReadonlyArray<VkFormatProperties2.Pointer> {
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

            public Array(VkFormatProperties2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkFormatProperties2.Pointer get(int i){
                return new VkFormatProperties2.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
