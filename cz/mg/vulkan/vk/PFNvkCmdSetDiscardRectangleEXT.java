package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetDiscardRectangleEXT.html">khronos documentation</a>
 **/
public class PFNvkCmdSetDiscardRectangleEXT extends VkFunctionPointer {
    public PFNvkCmdSetDiscardRectangleEXT() {
    }

    public PFNvkCmdSetDiscardRectangleEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetDiscardRectangleEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetDiscardRectangleEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDiscardRectangleEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDiscardRectangleEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 firstDiscardRectangle, VkUInt32 discardRectangleCount, VkRect2D pDiscardRectangles){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), firstDiscardRectangle != null ? firstDiscardRectangle.getVkAddress() : VkPointer.NULL, discardRectangleCount != null ? discardRectangleCount.getVkAddress() : VkPointer.NULL, pDiscardRectangles != null ? pDiscardRectangles.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long firstDiscardRectangle, long discardRectangleCount, long pDiscardRectangles);
}
