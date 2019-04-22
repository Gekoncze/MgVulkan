package cz.mg.vulkan;

public class VkDeviceEventInfoEXT extends VkObject {
    public VkDeviceEventInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT));
    }

    public VkDeviceEventInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceEventInfoEXT(VkMemory vkmemory, long vkaddress) {
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

    public VkDeviceEventTypeEXT getDeviceEvent() {
        return new VkDeviceEventTypeEXT(getVkMemory(), getDeviceEvent(getVkAddress()));
    }

    
    public void setDeviceEvent(VkDeviceEventTypeEXT deviceEvent) {
        setDeviceEvent(getVkAddress(), deviceEvent != null ? deviceEvent.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDeviceEventQ() {
        return getDeviceEvent().getValue();
    }

    public void setDeviceEvent(int deviceEvent) {
        getDeviceEvent().setValue(deviceEvent);
    }

    private static native long getDeviceEvent(long address);
    private static native void setDeviceEvent(long address, long deviceEvent);


    public static native long sizeof();

    public static class Array extends VkDeviceEventInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDeviceEventInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceEventInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT));;
        }

        public Array(int count, VkDeviceEventInfoEXT o){
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
        public VkDeviceEventInfoEXT get(int i){
            return new VkDeviceEventInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceEventInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceEventInfoEXT.Pointer> {
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

            public Array(VkDeviceEventInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceEventInfoEXT.Pointer get(int i){
                return new VkDeviceEventInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
