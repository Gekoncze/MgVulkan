package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkReallocationFunction.html">khronos documentation</a>
 **/
public class PFNvkReallocationFunction extends VkFunctionPointer {
    public PFNvkReallocationFunction() {
    }

    public PFNvkReallocationFunction(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkReallocationFunction(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkReallocationFunction(long value) {
        setValue(value);
    }

    public void call(VkObject pUserData, VkObject pOriginal, VkSize size, VkSize alignment, VkSystemAllocationScope allocationScope){
        call(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, pOriginal != null ? pOriginal.getVkAddress() : VkPointer.NULL, size != null ? size.getVkAddress() : VkPointer.NULL_ADDRESS, alignment != null ? alignment.getVkAddress() : VkPointer.NULL_ADDRESS, allocationScope != null ? allocationScope.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long pUserData, long pOriginal, long size, long alignment, long allocationScope);
}
