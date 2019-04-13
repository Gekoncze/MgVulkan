package cz.mg.vulkan;

public class VkPresentInfoKHR extends VkObject {
    public VkPresentInfoKHR() {
        super(sizeof());
    }

    public VkPresentInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPresentInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPresentInfoKHR(VkObject pNext, VkUInt32 waitSemaphoreCount, VkSemaphore pWaitSemaphores, VkUInt32 swapchainCount, VkSwapchainKHR pSwapchains, VkUInt32 pImageIndices, VkResult pResults) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PRESENT_INFO_KHR));
        setPNext(pNext);
        setWaitSemaphoreCount(waitSemaphoreCount);
        setPWaitSemaphores(pWaitSemaphores);
        setSwapchainCount(swapchainCount);
        setPSwapchains(pSwapchains);
        setPImageIndices(pImageIndices);
        setPResults(pResults);
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

    public VkUInt32 getWaitSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getWaitSemaphoreCount(getVkAddress()));
    }

    
    public void setWaitSemaphoreCount(VkUInt32 waitSemaphoreCount) {
        setWaitSemaphoreCount(getVkAddress(), waitSemaphoreCount != null ? waitSemaphoreCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getWaitSemaphoreCount(long address);
    private static native void setWaitSemaphoreCount(long address, long waitSemaphoreCount);

    public VkSemaphore getPWaitSemaphores() {
        return new VkSemaphore(getVkMemory(), getPWaitSemaphores(getVkAddress()));
    }

    private VkObject pWaitSemaphores = null;
    public void setPWaitSemaphores(VkSemaphore pWaitSemaphores) {
        setPWaitSemaphores(getVkAddress(), pWaitSemaphores != null ? pWaitSemaphores.getVkAddress() : VkPointer.NULL);
        this.pWaitSemaphores = pWaitSemaphores;
    }

    private static native long getPWaitSemaphores(long address);
    private static native void setPWaitSemaphores(long address, long pWaitSemaphores);

    public VkUInt32 getSwapchainCount() {
        return new VkUInt32(getVkMemory(), getSwapchainCount(getVkAddress()));
    }

    
    public void setSwapchainCount(VkUInt32 swapchainCount) {
        setSwapchainCount(getVkAddress(), swapchainCount != null ? swapchainCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSwapchainCount(long address);
    private static native void setSwapchainCount(long address, long swapchainCount);

    public VkSwapchainKHR getPSwapchains() {
        return new VkSwapchainKHR(getVkMemory(), getPSwapchains(getVkAddress()));
    }

    private VkObject pSwapchains = null;
    public void setPSwapchains(VkSwapchainKHR pSwapchains) {
        setPSwapchains(getVkAddress(), pSwapchains != null ? pSwapchains.getVkAddress() : VkPointer.NULL);
        this.pSwapchains = pSwapchains;
    }

    private static native long getPSwapchains(long address);
    private static native void setPSwapchains(long address, long pSwapchains);

    public VkUInt32 getPImageIndices() {
        return new VkUInt32(getVkMemory(), getPImageIndices(getVkAddress()));
    }

    private VkObject pImageIndices = null;
    public void setPImageIndices(VkUInt32 pImageIndices) {
        setPImageIndices(getVkAddress(), pImageIndices != null ? pImageIndices.getVkAddress() : VkPointer.NULL);
        this.pImageIndices = pImageIndices;
    }

    private static native long getPImageIndices(long address);
    private static native void setPImageIndices(long address, long pImageIndices);

    public VkResult getPResults() {
        return new VkResult(getVkMemory(), getPResults(getVkAddress()));
    }

    private VkObject pResults = null;
    public void setPResults(VkResult pResults) {
        setPResults(getVkAddress(), pResults != null ? pResults.getVkAddress() : VkPointer.NULL);
        this.pResults = pResults;
    }

    private static native long getPResults(long address);
    private static native void setPResults(long address, long pResults);


    public static native long sizeof();

    public static class Array extends VkPresentInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkPresentInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPresentInfoKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPresentInfoKHR o){
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
        public VkPresentInfoKHR get(int i){
            return new VkPresentInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPresentInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPresentInfoKHR.Pointer> {
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

            public Array(VkPresentInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPresentInfoKHR.Pointer get(int i){
                return new VkPresentInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
