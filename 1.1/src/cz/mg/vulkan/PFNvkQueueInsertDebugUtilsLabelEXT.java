package cz.mg.vulkan;

public class PFNvkQueueInsertDebugUtilsLabelEXT extends VkFunctionPointer {
    public PFNvkQueueInsertDebugUtilsLabelEXT() {
    }

    public PFNvkQueueInsertDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkQueueInsertDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkQueueInsertDebugUtilsLabelEXT(long value) {
        setValue(value);
    }

    public PFNvkQueueInsertDebugUtilsLabelEXT(VkInstance instance) {
        super(instance, new VkString("vkQueueInsertDebugUtilsLabelEXT"));
    }

    public void call(VkQueue queue, VkDebugUtilsLabelEXT pLabelInfo){
        call(getValue(), queue != null ? queue.getVkAddress() : VkPointer.getNullAddress(), pLabelInfo != null ? pLabelInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long queue, long pLabelInfo);
}
