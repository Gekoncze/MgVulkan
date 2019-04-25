package cz.mg.vulkan;

public class VkObject {
    private final VkMemory vkmemory;
    private final long vkaddress;

    public VkObject(long size) {
        this.vkmemory = new VkMemory(size);
        this.vkaddress = vkmemory.getAddress();
        if(vkmemory != null) vkmemory.check(vkaddress, 1);
        if(vkmemory != null) VkResourceManager.getInstance().add(this, vkmemory);
    }

    public VkObject(VkMemory vkmemory){
        this.vkmemory = vkmemory;
        this.vkaddress = vkmemory.getAddress();
        if(vkmemory != null) vkmemory.check(vkaddress, 1);
        if(vkmemory != null) VkResourceManager.getInstance().add(this, vkmemory);
    }

    public VkObject(VkMemory vkmemory, long vkaddress){
        this.vkmemory = vkmemory;
        this.vkaddress = vkaddress;
        if(vkmemory != null) vkmemory.check(vkaddress, 1);
        if(vkmemory != null) VkResourceManager.getInstance().add(this, vkmemory);
    }

    public VkMemory getVkMemory() {
        return vkmemory;
    }

    public long getVkAddress(){
        return vkaddress;
    }
}
