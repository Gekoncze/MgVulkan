package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferUsageFlags.html">khronos documentation</a>
 **/
public class VulkanBufferUsageFlags extends VulkanFlags {
    public VulkanBufferUsageFlags(){
        super(new VkBufferUsageFlags());
    }

    public VulkanBufferUsageFlags(VkBufferUsageFlags vk){
        super(vk);
    }

    @Override
    public VkBufferUsageFlags getVk(){
        return (VkBufferUsageFlags) super.getVk();
    }

    public VulkanBufferUsageFlags(int value){
        super(new VkBufferUsageFlags(value));
    }

    public static class Array extends VulkanBufferUsageFlags implements cz.mg.collections.array.ReadonlyArray<VulkanBufferUsageFlags> {
        public Array(VkBufferUsageFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBufferUsageFlags.Array(count));
        }

        public Array(int count, VulkanBufferUsageFlags o){
            this(new VkBufferUsageFlags.Array(count, o.getVk()));
        }

        @Override
        public VkBufferUsageFlags.Array getVk(){
            return (VkBufferUsageFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBufferUsageFlags get(int i){
            return new VulkanBufferUsageFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBufferUsageFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBufferUsageFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkBufferUsageFlags.Pointer(value));
        }

        @Override
        public VkBufferUsageFlags.Pointer getVk(){
            return (VkBufferUsageFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanBufferUsageFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBufferUsageFlags.Pointer> {
            public Array(int count) {
                super(new VkBufferUsageFlags.Pointer.Array(count));
            }

            public Array(VulkanBufferUsageFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBufferUsageFlags.Pointer.Array getVk(){
                return (VkBufferUsageFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBufferUsageFlags.Pointer get(int i){
                return new VulkanBufferUsageFlags.Pointer(getVk().get(i));
            }
        }
    }
}
