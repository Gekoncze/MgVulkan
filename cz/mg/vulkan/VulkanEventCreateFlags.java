package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkEventCreateFlags.html">khronos documentation</a>
 **/
public class VulkanEventCreateFlags extends VulkanFlags {
    public VulkanEventCreateFlags(){
        super(new VkEventCreateFlags());
    }

    public VulkanEventCreateFlags(VkEventCreateFlags vk){
        super(vk);
    }

    @Override
    public VkEventCreateFlags getVk(){
        return (VkEventCreateFlags) super.getVk();
    }

    public VulkanEventCreateFlags(int value){
        super(new VkEventCreateFlags(value));
    }

    public static class Array extends VulkanEventCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanEventCreateFlags> {
        public Array(VkEventCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkEventCreateFlags.Array(count));
        }

        public Array(int count, VulkanEventCreateFlags o){
            this(new VkEventCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkEventCreateFlags.Array getVk(){
            return (VkEventCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanEventCreateFlags get(int i){
            return new VulkanEventCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkEventCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkEventCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkEventCreateFlags.Pointer(value));
        }

        @Override
        public VkEventCreateFlags.Pointer getVk(){
            return (VkEventCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanEventCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanEventCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkEventCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanEventCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkEventCreateFlags.Pointer.Array getVk(){
                return (VkEventCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanEventCreateFlags.Pointer get(int i){
                return new VulkanEventCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
