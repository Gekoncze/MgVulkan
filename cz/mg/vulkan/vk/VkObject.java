package cz.mg.vulkan.vk;

public class VkObject {
    private final long sizeof;
    private final VkMemory vkmemory;
    private final long vkaddress;

    public VkObject(long size) {
        this.sizeof = size;
        this.vkmemory = new VkMemory(size);
        this.vkaddress = vkmemory.getAddress();
        if(vkmemory != null) vkmemory.check(vkaddress, size);
        if(vkmemory != null) VkResourceManager.getInstance().add(this, vkmemory);
    }

    public VkObject(long size, VkMemory vkmemory){
        this.sizeof = size;
        this.vkmemory = vkmemory;
        this.vkaddress = vkmemory.getAddress();
        if(vkmemory != null) vkmemory.check(vkaddress, size);
        if(vkmemory != null) VkResourceManager.getInstance().add(this, vkmemory);
    }

    public VkObject(long size, VkMemory vkmemory, long vkaddress){
        this.sizeof = size;
        this.vkmemory = vkmemory;
        this.vkaddress = vkaddress;
        if(vkmemory != null) vkmemory.check(vkaddress, size);
        if(vkmemory != null) VkResourceManager.getInstance().add(this, vkmemory);
    }

    public VkObject(VkMemory vkmemory, long vkaddress){
        this.sizeof = 0;
        this.vkmemory = vkmemory;
        this.vkaddress = vkaddress;
        if(vkmemory != null) vkmemory.check(vkaddress, 0);
        if(vkmemory != null) VkResourceManager.getInstance().add(this, vkmemory);
    }

    public long getSizeof() {
        return sizeof;
    }

    public VkMemory getVkMemory() {
        return vkmemory;
    }

    public long getVkAddress(){
        return vkaddress;
    }

    public static class Pointer extends VkPointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
                this.count = count;
            }

            public Array(VkMemory vkmemory, int count) {
                super(vkmemory);
                this.count = count;
            }

            public Array(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress);
                this.count = count;
            }

            public Array(VkObject[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
