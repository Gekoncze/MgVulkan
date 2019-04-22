package cz.mg.vulkan;

public class VkDeviceGroupRenderPassBeginInfoKHX extends VkObject {
    public VkDeviceGroupRenderPassBeginInfoKHX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHX));
    }

    public VkDeviceGroupRenderPassBeginInfoKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupRenderPassBeginInfoKHX(VkMemory vkmemory, long vkaddress) {
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

    public VkUInt32 getDeviceMask() {
        return new VkUInt32(getVkMemory(), getDeviceMask(getVkAddress()));
    }

    
    public void setDeviceMask(VkUInt32 deviceMask) {
        setDeviceMask(getVkAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDeviceMaskQ() {
        return getDeviceMask().getValue();
    }

    public void setDeviceMask(int deviceMask) {
        getDeviceMask().setValue(deviceMask);
    }

    private static native long getDeviceMask(long address);
    private static native void setDeviceMask(long address, long deviceMask);

    public VkUInt32 getDeviceRenderAreaCount() {
        return new VkUInt32(getVkMemory(), getDeviceRenderAreaCount(getVkAddress()));
    }

    
    public void setDeviceRenderAreaCount(VkUInt32 deviceRenderAreaCount) {
        setDeviceRenderAreaCount(getVkAddress(), deviceRenderAreaCount != null ? deviceRenderAreaCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDeviceRenderAreaCountQ() {
        return getDeviceRenderAreaCount().getValue();
    }

    public void setDeviceRenderAreaCount(int deviceRenderAreaCount) {
        getDeviceRenderAreaCount().setValue(deviceRenderAreaCount);
    }

    private static native long getDeviceRenderAreaCount(long address);
    private static native void setDeviceRenderAreaCount(long address, long deviceRenderAreaCount);

    public VkRect2D getPDeviceRenderAreas() {
        return new VkRect2D(getVkMemory(), getPDeviceRenderAreas(getVkAddress()));
    }

    private VkObject pDeviceRenderAreas = null;
    public void setPDeviceRenderAreas(VkRect2D pDeviceRenderAreas) {
        setPDeviceRenderAreas(getVkAddress(), pDeviceRenderAreas != null ? pDeviceRenderAreas.getVkAddress() : VkPointer.NULL);
        this.pDeviceRenderAreas = pDeviceRenderAreas;
    }

    private static native long getPDeviceRenderAreas(long address);
    private static native void setPDeviceRenderAreas(long address, long pDeviceRenderAreas);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupRenderPassBeginInfoKHX implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupRenderPassBeginInfoKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupRenderPassBeginInfoKHX.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHX));;
        }

        public Array(int count, VkDeviceGroupRenderPassBeginInfoKHX o){
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
        public VkDeviceGroupRenderPassBeginInfoKHX get(int i){
            return new VkDeviceGroupRenderPassBeginInfoKHX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceGroupRenderPassBeginInfoKHX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupRenderPassBeginInfoKHX.Pointer> {
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

            public Array(VkDeviceGroupRenderPassBeginInfoKHX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceGroupRenderPassBeginInfoKHX.Pointer get(int i){
                return new VkDeviceGroupRenderPassBeginInfoKHX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
