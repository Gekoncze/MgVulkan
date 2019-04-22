package cz.mg.vulkan;

public class VkDisplayEventInfoEXT extends VkObject {
    public VkDisplayEventInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT));
    }

    public VkDisplayEventInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayEventInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
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

    public VkDisplayEventTypeEXT getDisplayEvent() {
        return new VkDisplayEventTypeEXT(getVkMemory(), getDisplayEvent(getVkAddress()));
    }

    
    public void setDisplayEvent(VkDisplayEventTypeEXT displayEvent) {
        setDisplayEvent(getVkAddress(), displayEvent != null ? displayEvent.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDisplayEventQ() {
        return getDisplayEvent().getValue();
    }

    public void setDisplayEvent(int displayEvent) {
        getDisplayEvent().setValue(displayEvent);
    }

    private static native long getDisplayEvent(long address);
    private static native void setDisplayEvent(long address, long displayEvent);


    public static native long sizeof();

    public static class Array extends VkDisplayEventInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDisplayEventInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayEventInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT));;
        }

        public Array(int count, VkDisplayEventInfoEXT o){
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
        public VkDisplayEventInfoEXT get(int i){
            return new VkDisplayEventInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDisplayEventInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplayEventInfoEXT.Pointer> {
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

            public Array(VkDisplayEventInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplayEventInfoEXT.Pointer get(int i){
                return new VkDisplayEventInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
