package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetStencilWriteMask.html">khronos documentation</a>
 **/
public class PFNvkCmdSetStencilWriteMask extends VkFunctionPointer {
    public PFNvkCmdSetStencilWriteMask() {
    }

    public PFNvkCmdSetStencilWriteMask(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetStencilWriteMask(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetStencilWriteMask(long value) {
        setValue(value);
    }

    public PFNvkCmdSetStencilWriteMask(VkInstance instance) {
        super(instance, new VkString("vkCmdSetStencilWriteMask"));
    }

    public void call(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkUInt32 writeMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), faceMask != null ? faceMask.getVkAddress() : VkPointer.NULL, writeMask != null ? writeMask.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long faceMask, long writeMask);
}
