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

        public static class Array extends VkObject.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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
