package cz.mg.vulkan;

public class VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX extends VkObject {
    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX() {
        super(sizeof());
    }

    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(VkStructureType sType, VkObject pNext, VkBool32 perViewPositionAllComponents) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setPerViewPositionAllComponents(perViewPositionAllComponents);
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

    public VkBool32 getPerViewPositionAllComponents() {
        return new VkBool32(getVkMemory(), getPerViewPositionAllComponents(getVkAddress()));
    }

    
    public void setPerViewPositionAllComponents(VkBool32 perViewPositionAllComponents) {
        setPerViewPositionAllComponents(getVkAddress(), perViewPositionAllComponents != null ? perViewPositionAllComponents.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getPerViewPositionAllComponents(long address);
    private static native void setPerViewPositionAllComponents(long address, long perViewPositionAllComponents);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX o){
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
        public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX get(int i){
            return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer> {
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

            public Array(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer get(int i){
                return new VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
