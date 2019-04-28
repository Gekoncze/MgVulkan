package cz.mg.vulkan;

public class PFNvkCmdSetDiscardRectangleEXT extends VkFunctionPointer {
    public PFNvkCmdSetDiscardRectangleEXT() {
    }

    protected PFNvkCmdSetDiscardRectangleEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetDiscardRectangleEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetDiscardRectangleEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDiscardRectangleEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDiscardRectangleEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, int firstDiscardRectangle, int discardRectangleCount, VkRect2D pDiscardRectangles){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), firstDiscardRectangle, discardRectangleCount, pDiscardRectangles != null ? pDiscardRectangles.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, int firstDiscardRectangle, int discardRectangleCount, long pDiscardRectangles);

}
