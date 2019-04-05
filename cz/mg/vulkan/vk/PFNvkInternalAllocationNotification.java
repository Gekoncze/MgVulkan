package cz.mg.vulkan.vk;

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
        call(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, size != null ? size.getVkAddress() : VkPointer.NULL_ADDRESS, allocationType != null ? allocationType.getVkAddress() : VkPointer.NULL_ADDRESS, allocationScope != null ? allocationScope.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long pUserData, long size, long allocationType, long allocationScope);
}
