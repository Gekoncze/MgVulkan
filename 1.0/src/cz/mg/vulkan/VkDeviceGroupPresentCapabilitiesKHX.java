package cz.mg.vulkan;

public class VkDeviceGroupPresentCapabilitiesKHX extends VkObject {
    public VkDeviceGroupPresentCapabilitiesKHX() {
        super(sizeof());
    }

    public VkDeviceGroupPresentCapabilitiesKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupPresentCapabilitiesKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkUInt32 getPresentMask() {
        return new VkUInt32(getVkMemory(), getPresentMask(getVkAddress()));
    }

    
    public void setPresentMask(VkUInt32 presentMask) {
        setPresentMask(getVkAddress(), presentMask != null ? presentMask.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getPresentMask(long address);
    protected static native void setPresentMask(long address, long presentMask);

    public VkDeviceGroupPresentModeFlagsKHX getModes() {
        return new VkDeviceGroupPresentModeFlagsKHX(getVkMemory(), getModes(getVkAddress()));
    }

    
    public void setModes(VkDeviceGroupPresentModeFlagsKHX modes) {
        setModes(getVkAddress(), modes != null ? modes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getModesQ() {
        return getModes().getValue();
    }

    public void setModes(int modes) {
        getModes().setValue(modes);
    }

    protected static native long getModes(long address);
    protected static native void setModes(long address, long modes);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupPresentCapabilitiesKHX implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupPresentCapabilitiesKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupPresentCapabilitiesKHX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceGroupPresentCapabilitiesKHX o){
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
        public VkDeviceGroupPresentCapabilitiesKHX get(int i){
            return new VkDeviceGroupPresentCapabilitiesKHX(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

        public static class Array extends VkDeviceGroupPresentCapabilitiesKHX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupPresentCapabilitiesKHX.Pointer> {
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

            public Array(VkDeviceGroupPresentCapabilitiesKHX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceGroupPresentCapabilitiesKHX.Pointer get(int i){
                return new VkDeviceGroupPresentCapabilitiesKHX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
