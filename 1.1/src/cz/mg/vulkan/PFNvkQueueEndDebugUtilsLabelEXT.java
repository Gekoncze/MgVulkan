package cz.mg.vulkan;

public class PFNvkQueueEndDebugUtilsLabelEXT extends VkFunctionPointer {
    public PFNvkQueueEndDebugUtilsLabelEXT() {
    }

    protected PFNvkQueueEndDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkQueueEndDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkQueueEndDebugUtilsLabelEXT(long value) {
        setValue(value);
    }

    public PFNvkQueueEndDebugUtilsLabelEXT(VkInstance instance) {
        super(instance, new VkString("vkQueueEndDebugUtilsLabelEXT"));
    }

    public void call(VkQueue queue){
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long queue);
}
