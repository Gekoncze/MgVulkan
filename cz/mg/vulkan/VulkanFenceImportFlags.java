package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFenceImportFlags.html">khronos documentation</a>
 **/
public class VulkanFenceImportFlags extends VulkanFlags {
    public VulkanFenceImportFlags(){
        super(new VkFenceImportFlags());
    }

    public VulkanFenceImportFlags(VkFenceImportFlags vk){
        super(vk);
    }

    @Override
    public VkFenceImportFlags getVk(){
        return (VkFenceImportFlags) super.getVk();
    }

    public VulkanFenceImportFlags(int value){
        super(new VkFenceImportFlags(value));
    }

    public static class Array extends VulkanFenceImportFlags implements cz.mg.collections.array.ReadonlyArray<VulkanFenceImportFlags> {
        public Array(VkFenceImportFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFenceImportFlags.Array(count));
        }

        public Array(int count, VulkanFenceImportFlags o){
            this(new VkFenceImportFlags.Array(count, o.getVk()));
        }

        @Override
        public VkFenceImportFlags.Array getVk(){
            return (VkFenceImportFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFenceImportFlags get(int i){
            return new VulkanFenceImportFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFenceImportFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFenceImportFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkFenceImportFlags.Pointer(value));
        }

        @Override
        public VkFenceImportFlags.Pointer getVk(){
            return (VkFenceImportFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanFenceImportFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFenceImportFlags.Pointer> {
            public Array(int count) {
                super(new VkFenceImportFlags.Pointer.Array(count));
            }

            public Array(VulkanFenceImportFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFenceImportFlags.Pointer.Array getVk(){
                return (VkFenceImportFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFenceImportFlags.Pointer get(int i){
                return new VulkanFenceImportFlags.Pointer(getVk().get(i));
            }
        }
    }
}
