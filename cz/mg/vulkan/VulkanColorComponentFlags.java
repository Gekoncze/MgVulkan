package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkColorComponentFlags.html">khronos documentation</a>
 **/
public class VulkanColorComponentFlags extends VulkanFlags {
    public VulkanColorComponentFlags(){
        super(new VkColorComponentFlags());
    }

    public VulkanColorComponentFlags(VkColorComponentFlags vk){
        super(vk);
    }

    @Override
    public VkColorComponentFlags getVk(){
        return (VkColorComponentFlags) super.getVk();
    }

    public VulkanColorComponentFlags(int value){
        super(new VkColorComponentFlags(value));
    }

    public static class Array extends VulkanColorComponentFlags implements cz.mg.collections.array.ReadonlyArray<VulkanColorComponentFlags> {
        public Array(VkColorComponentFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkColorComponentFlags.Array(count));
        }

        public Array(int count, VulkanColorComponentFlags o){
            this(new VkColorComponentFlags.Array(count, o.getVk()));
        }

        @Override
        public VkColorComponentFlags.Array getVk(){
            return (VkColorComponentFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanColorComponentFlags get(int i){
            return new VulkanColorComponentFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkColorComponentFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkColorComponentFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkColorComponentFlags.Pointer(value));
        }

        @Override
        public VkColorComponentFlags.Pointer getVk(){
            return (VkColorComponentFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanColorComponentFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanColorComponentFlags.Pointer> {
            public Array(int count) {
                super(new VkColorComponentFlags.Pointer.Array(count));
            }

            public Array(VulkanColorComponentFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkColorComponentFlags.Pointer.Array getVk(){
                return (VkColorComponentFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanColorComponentFlags.Pointer get(int i){
                return new VulkanColorComponentFlags.Pointer(getVk().get(i));
            }
        }
    }
}
