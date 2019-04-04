package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDependencyFlags.html">khronos documentation</a>
 **/
public class VulkanDependencyFlags extends VulkanFlags {
    public VulkanDependencyFlags(){
        super(new VkDependencyFlags());
    }

    public VulkanDependencyFlags(VkDependencyFlags vk){
        super(vk);
    }

    @Override
    public VkDependencyFlags getVk(){
        return (VkDependencyFlags) super.getVk();
    }

    public VulkanDependencyFlags(int value){
        super(new VkDependencyFlags(value));
    }

    public static class Array extends VulkanDependencyFlags implements cz.mg.collections.array.ReadonlyArray<VulkanDependencyFlags> {
        public Array(VkDependencyFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDependencyFlags.Array(count));
        }

        public Array(int count, VulkanDependencyFlags o){
            this(new VkDependencyFlags.Array(count, o.getVk()));
        }

        @Override
        public VkDependencyFlags.Array getVk(){
            return (VkDependencyFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDependencyFlags get(int i){
            return new VulkanDependencyFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDependencyFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDependencyFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkDependencyFlags.Pointer(value));
        }

        @Override
        public VkDependencyFlags.Pointer getVk(){
            return (VkDependencyFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanDependencyFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDependencyFlags.Pointer> {
            public Array(int count) {
                super(new VkDependencyFlags.Pointer.Array(count));
            }

            public Array(VulkanDependencyFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDependencyFlags.Pointer.Array getVk(){
                return (VkDependencyFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDependencyFlags.Pointer get(int i){
                return new VulkanDependencyFlags.Pointer(getVk().get(i));
            }
        }
    }
}
