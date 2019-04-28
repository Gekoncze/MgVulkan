package cz.mg.vulkan;

public class PFNvkQueueInsertDebugUtilsLabelEXT extends VkFunctionPointer {
    public PFNvkQueueInsertDebugUtilsLabelEXT() {
    }

    protected PFNvkQueueInsertDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkQueueInsertDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkQueueInsertDebugUtilsLabelEXT(long value) {
        setValue(value);
    }

    public PFNvkQueueInsertDebugUtilsLabelEXT(VkInstance instance) {
        super(instance, new VkString("vkQueueInsertDebugUtilsLabelEXT"));
    }

    public void call(VkQueue queue, VkDebugUtilsLabelEXT pLabelInfo){
        callNative(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddressNative(), pLabelInfo != null ? pLabelInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long queue, long pLabelInfo);



}
