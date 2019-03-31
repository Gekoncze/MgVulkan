package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkInternalFreeNotification.html">khronos documentation</a>
 **/
public class PFNvkInternalFreeNotification extends VkFunctionPointer {
    public PFNvkInternalFreeNotification() {
    }

    public PFNvkInternalFreeNotification(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkInternalFreeNotification(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkInternalFreeNotification(long value) {
        setValue(value);
    }

    public void call(VkObject pUserData, VkSize size, VkInternalAllocationType allocationType, VkSystemAllocationScope allocationScope){
        call(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, size != null ? size.getVkAddress() : VkPointer.NULL, allocationType != null ? allocationType.getVkAddress() : VkPointer.NULL, allocationScope != null ? allocationScope.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long pUserData, long size, long allocationType, long allocationScope);
}
