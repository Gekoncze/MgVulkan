package cz.mg.vulkan;

public class PFNvkCmdDraw extends VkFunctionPointer {
    public PFNvkCmdDraw() {
    }

    protected PFNvkCmdDraw(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDraw(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDraw(long value) {
        setValue(value);
    }

    public PFNvkCmdDraw(VkInstance instance) {
        super(instance, new VkString("vkCmdDraw"));
    }

    public void call(VkCommandBuffer commandBuffer, int vertexCount, int instanceCount, int firstVertex, int firstInstance){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), vertexCount, instanceCount, firstVertex, firstInstance);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, int vertexCount, int instanceCount, int firstVertex, int firstInstance);

}
