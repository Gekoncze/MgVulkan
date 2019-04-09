package cz.mg.vulkan;

public class VkDebugMarkerMarkerInfoEXT extends VkObject {
    public VkDebugMarkerMarkerInfoEXT() {
        super(sizeof());
    }

    public VkDebugMarkerMarkerInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugMarkerMarkerInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDebugMarkerMarkerInfoEXT(VkObject pNext, VkChar pMarkerName, VkFloat color) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT));
        setPNext(pNext);
        setPMarkerName(pMarkerName);
        setColor(color);
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

    public VkChar getPMarkerName() {
        return new VkChar(getVkMemory(), getPMarkerName(getVkAddress()));
    }

    private VkObject pMarkerName = null;
    public void setPMarkerName(VkChar pMarkerName) {
        setPMarkerName(getVkAddress(), pMarkerName != null ? pMarkerName.getVkAddress() : VkPointer.NULL);
        this.pMarkerName = pMarkerName;
    }

    private static native long getPMarkerName(long address);
    private static native void setPMarkerName(long address, long pMarkerName);

    public VkFloat getColor() {
        return new VkFloat(getVkMemory(), getColor(getVkAddress()));
    }

    
    public void setColor(VkFloat color) {
        setColor(getVkAddress(), color != null ? color.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getColor(long address);
    private static native void setColor(long address, long color);


    public static native long sizeof();

    public static class Array extends VkDebugMarkerMarkerInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugMarkerMarkerInfoEXT> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugMarkerMarkerInfoEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugMarkerMarkerInfoEXT o){
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
        public VkDebugMarkerMarkerInfoEXT get(int i){
            return new VkDebugMarkerMarkerInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkDebugMarkerMarkerInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugMarkerMarkerInfoEXT.Pointer> {
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

            public Array(VkDebugMarkerMarkerInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugMarkerMarkerInfoEXT.Pointer get(int i){
                return new VkDebugMarkerMarkerInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
