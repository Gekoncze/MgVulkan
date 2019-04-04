package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferViewCreateFlags.html">khronos documentation</a>
 **/
public class VulkanBufferViewCreateFlags extends VulkanFlags {
    public VulkanBufferViewCreateFlags(){
        super(new VkBufferViewCreateFlags());
    }

    public VulkanBufferViewCreateFlags(VkBufferViewCreateFlags vk){
        super(vk);
    }

    @Override
    public VkBufferViewCreateFlags getVk(){
        return (VkBufferViewCreateFlags) super.getVk();
    }

    public VulkanBufferViewCreateFlags(int value){
        super(new VkBufferViewCreateFlags(value));
    }

    public static class Array extends VulkanBufferViewCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanBufferViewCreateFlags> {
        public Array(VkBufferViewCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBufferViewCreateFlags.Array(count));
        }

        public Array(int count, VulkanBufferViewCreateFlags o){
            this(new VkBufferViewCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkBufferViewCreateFlags.Array getVk(){
            return (VkBufferViewCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBufferViewCreateFlags get(int i){
            return new VulkanBufferViewCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBufferViewCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBufferViewCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkBufferViewCreateFlags.Pointer(value));
        }

        @Override
        public VkBufferViewCreateFlags.Pointer getVk(){
            return (VkBufferViewCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanBufferViewCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBufferViewCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkBufferViewCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanBufferViewCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBufferViewCreateFlags.Pointer.Array getVk(){
                return (VkBufferViewCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBufferViewCreateFlags.Pointer get(int i){
                return new VulkanBufferViewCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
