package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferCreateFlags.html">khronos documentation</a>
 **/
public class VulkanBufferCreateFlags extends VulkanFlags {
    public VulkanBufferCreateFlags(){
        super(new VkBufferCreateFlags());
    }

    public VulkanBufferCreateFlags(VkBufferCreateFlags vk){
        super(vk);
    }

    @Override
    public VkBufferCreateFlags getVk(){
        return (VkBufferCreateFlags) super.getVk();
    }

    public VulkanBufferCreateFlags(int value){
        super(new VkBufferCreateFlags(value));
    }

    public static class Array extends VulkanBufferCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanBufferCreateFlags> {
        public Array(VkBufferCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBufferCreateFlags.Array(count));
        }

        public Array(int count, VulkanBufferCreateFlags o){
            this(new VkBufferCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkBufferCreateFlags.Array getVk(){
            return (VkBufferCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBufferCreateFlags get(int i){
            return new VulkanBufferCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBufferCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBufferCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkBufferCreateFlags.Pointer(value));
        }

        @Override
        public VkBufferCreateFlags.Pointer getVk(){
            return (VkBufferCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanBufferCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBufferCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkBufferCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanBufferCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBufferCreateFlags.Pointer.Array getVk(){
                return (VkBufferCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBufferCreateFlags.Pointer get(int i){
                return new VulkanBufferCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
