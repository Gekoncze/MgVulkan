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

    public void call(VkCommandBuffer commandBuffer, VkResult rval){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long rval);
}
