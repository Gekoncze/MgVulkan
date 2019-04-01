package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetViewport.html">khronos documentation</a>
 **/
public class PFNvkCmdSetViewport extends VkFunctionPointer {
    public PFNvkCmdSetViewport() {
    }

    public PFNvkCmdSetViewport(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetViewport(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetViewport(long value) {
        setValue(value);
    }

    public PFNvkCmdSetViewport(VkInstance instance) {
        super(instance, new VkString("vkCmdSetViewport"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 firstViewport, VkUInt32 viewportCount, VkViewport pViewports){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, firstViewport != null ? firstViewport.getVkAddress() : VkPointer.NULL_ADDRESS, viewportCount != null ? viewportCount.getVkAddress() : VkPointer.NULL_ADDRESS, pViewports != null ? pViewports.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long firstViewport, long viewportCount, long pViewports);
}
