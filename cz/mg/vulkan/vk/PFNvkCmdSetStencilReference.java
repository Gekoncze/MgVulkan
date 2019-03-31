package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetStencilReference.html">khronos documentation</a>
 **/
public class PFNvkCmdSetStencilReference extends VkFunctionPointer {
    public PFNvkCmdSetStencilReference() {
    }

    public PFNvkCmdSetStencilReference(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetStencilReference(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetStencilReference(long value) {
        setValue(value);
    }

    public PFNvkCmdSetStencilReference(VkInstance instance) {
        super(instance, new VkString("vkCmdSetStencilReference"));
    }

    public void call(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkUInt32 reference){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), faceMask != null ? faceMask.getVkAddress() : VkPointer.NULL, reference != null ? reference.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long faceMask, long reference);
}
