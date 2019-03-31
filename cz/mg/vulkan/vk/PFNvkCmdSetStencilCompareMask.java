package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetStencilCompareMask.html">khronos documentation</a>
 **/
public class PFNvkCmdSetStencilCompareMask extends VkFunctionPointer {
    public PFNvkCmdSetStencilCompareMask() {
    }

    public PFNvkCmdSetStencilCompareMask(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetStencilCompareMask(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetStencilCompareMask(long value) {
        setValue(value);
    }

    public PFNvkCmdSetStencilCompareMask(VkInstance instance) {
        super(instance, new VkString("vkCmdSetStencilCompareMask"));
    }

    public void call(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkUInt32 compareMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), faceMask != null ? faceMask.getVkAddress() : VkPointer.NULL, compareMask != null ? compareMask.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long faceMask, long compareMask);
}
