package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkAllocationFunction.html">khronos documentation</a>
 **/
public class PFNvkAllocationFunction extends VkFunctionPointer {
    public PFNvkAllocationFunction() {
    }

    public PFNvkAllocationFunction(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkAllocationFunction(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkAllocationFunction(long value) {
        setValue(value);
    }

    public void call(VkObject pUserData, VkSize size, VkSize alignment, VkSystemAllocationScope allocationScope){
        call(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, size != null ? size.getVkAddress() : VkPointer.NULL, alignment != null ? alignment.getVkAddress() : VkPointer.NULL, allocationScope != null ? allocationScope.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long pUserData, long size, long alignment, long allocationScope);
}
