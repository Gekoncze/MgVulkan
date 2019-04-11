package cz.mg.vulkan;

public class PFNvkInternalAllocationNotification extends VkFunctionPointer {
    public PFNvkInternalAllocationNotification() {
    }

    public PFNvkInternalAllocationNotification(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkInternalAllocationNotification(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkInternalAllocationNotification(long value) {
        setValue(value);
    }

    public void call(VkObject pUserData, VkSize size, VkInternalAllocationType allocationType, VkSystemAllocationScope allocationScope){
        call(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, size != null ? size.getVkAddress() : VkPointer.getNullAddress(), allocationType != null ? allocationType.getVkAddress() : VkPointer.getNullAddress(), allocationScope != null ? allocationScope.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long pUserData, long size, long allocationType, long allocationScope);
}
