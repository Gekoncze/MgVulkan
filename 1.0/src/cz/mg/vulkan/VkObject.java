package cz.mg.vulkan;

public class VkObject {
    private final VkMemory vkmemory;
    private final long vkaddress;

    protected VkObject(long size) {
        this(new VkMemory(size));
    }

    protected VkObject(VkMemory vkmemory){
        this(vkmemory, vkmemory.getAddress());
    }

    protected VkObject(VkMemory vkmemory, long vkaddress){
        this.vkmemory = vkmemory;
        this.vkaddress = vkaddress;
        if(vkmemory != null) vkmemory.check(vkaddress, 1);
        if(vkmemory != null) VkResourceManager.getInstance().add(this, vkmemory);
    }

    protected VkObject(VkPointer pointer){
        this.vkmemory = null;
        this.vkaddress = pointer.getValue();
    }

    public VkMemory getVkMemory() {
        return vkmemory;
    }

    public long getVkAddress(){
        return vkaddress;
    }
}
