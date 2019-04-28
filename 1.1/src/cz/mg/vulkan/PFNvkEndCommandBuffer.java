package cz.mg.vulkan;

public class PFNvkEndCommandBuffer extends VkFunctionPointer {
    public PFNvkEndCommandBuffer() {
    }

    protected PFNvkEndCommandBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkEndCommandBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkEndCommandBuffer(long value) {
        setValue(value);
    }

    public PFNvkEndCommandBuffer(VkInstance instance) {
        super(instance, new VkString("vkEndCommandBuffer"));
    }

    public int call(VkCommandBuffer commandBuffer){
        return callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native int callNative(long vkaddress, long commandBuffer);

}
